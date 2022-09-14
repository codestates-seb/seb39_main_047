import * as S from './style';

export type Props = {
  children: React.ReactNode;
  onClick: () => void;
  type: 'button' | 'submit';
};

const Button: React.FC<Props> = ({ children, onClick, type }) => {
  return (
    <S.ButtonComponent type={type} onClick={onClick}>
      {children}
    </S.ButtonComponent>
  );
};

export default Button;
